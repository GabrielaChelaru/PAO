
import java.util.List;
import java.util.Scanner;


public abstract class Buy {
    protected int iState;
    protected int iSelected_index;
    protected int iMax_Index;
    public Buy()
    {
        iState = 0;
        iSelected_index = 0;
        iMax_Index = 0;
    }
    public Buy(int iMax) {
        iState = 0;
        iSelected_index = 0;
        iMax_Index = iMax;
    }
    protected  void SetMaxIndex(int x)
    {
        iMax_Index = x;
    }
    public abstract boolean ControlPanel();
    public abstract List GetList();
    public void scanIndex()
    {
        Scanner scan = new Scanner(System.in);
        iSelected_index = scan.nextInt();
    }
}
