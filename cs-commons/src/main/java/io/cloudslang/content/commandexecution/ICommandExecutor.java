package io.cloudslang.content.commandexecution;


import io.cloudslang.content.commandexecution.entities.Address;

public interface ICommandExecutor {

    static final int OP_DEFAULT_TIMEOUT = 90000; // 90 secs
    static final String OP_DEFAULT_CHARACTERSET = "UTF-8";

    public void setRemoteCredentials(Address address, String username, String password, String privateKeyFile) throws UnsupportedOperationException;

    public abstract ICommandResult execute(String command, String arguments) throws Exception;

    public void setArgument(Argument name, Object value);

    public String getProtocolName();

    public Type getType();

    // Some executors need the IActionRegistry in order to call other iactions. Those that do not need this
    // can supply an empty method
    //public void setActionRegistry(IActionRegistry registry);

    public enum Type {
        GLOBALSHELL,
        LOCAL,
        HPOM,
        NASCONNECTTELNET,
        REXEC,
        ROSH,
        RSH,
        SSH,
        TELNET,
        WMI,
    }

    public static enum Argument {
        ENVIRONMENT,
        HPOM_NODE,
        HPOM_PROTOCOL,
        KERBEROS_TICKET,
        NAS_DEVICE,
        NAS_DEVICE_CONSOLE_MODE,
        OUTPUT_PATH,
        PASSWORD_PROMPT,
        PTY,
        RETURN_IMMEDIATELY,
        SAS_HOST,
        SAS_USERNAME,
        START_DIR,
        TIMEOUT,
        USERNAME_PROMPT,
        CHARACTERSET,
    }
}
