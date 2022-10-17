import java.util.Arrays;

public class Call {
    private int sourceNum; // source number
    private int destNum; //destination number
    private int callDuration; //in seconds
    private boolean wasLocal;

    public static final double BAND1 = 0.20;
    public static final double BAND2 = 0.25;
    public static final double BAND3 = 0.30;
    public static final double LOCAL = 0.15;
    public static final int numMaxCalls = 15;

    public Call(int sourceNum, int destNum, int callDuration, boolean wasLocal) {
        this.sourceNum = sourceNum;
        this.destNum = destNum;
        this.callDuration = callDuration;
        this.wasLocal = wasLocal;

    }

    public int getSourceNum() {
        return sourceNum;
    }

    public int getDestNum() {
        return destNum;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public boolean isWasLocal() {
        return wasLocal;
    }

    @Override
    public String toString() {
        return "Call{" +
                "sourceNum=" + sourceNum +
                ", destNum=" + destNum +
                ", callDuration=" + callDuration +
                ", wasLocal=" + wasLocal +
                '}';
    }
}
