package io.cloudslang.content.commandexecution;

public interface ICommandResult {
    public int getReturnCode(boolean throwIfUnknown) throws UnsupportedOperationException;

    public String getStandardOutput(boolean throwIfUnknown) throws UnsupportedOperationException;

    public String getStandardError(boolean throwIfUnknown) throws UnsupportedOperationException;

    public String getCompleteOutput(boolean throwIfUnknown) throws UnsupportedOperationException;

    public String getExceptionOutput(boolean throwIfUnknown) throws UnsupportedOperationException;

    public Integer getCommandExitCode();
}
