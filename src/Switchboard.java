import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Switchboard {
    private Call[] calls;
    private int numRegisterCall;

    public Switchboard(int numMaxCalls){
        numRegisterCall = 0;
        calls = new Call[numMaxCalls];
        for(int i = 0; i < calls.length; i++) {
            calls[i] = null;
        }
    }

    public void registerCall(Call call) {
        calls[numRegisterCall] = call;
        numRegisterCall++;
    }
}
