public class LoggedOutState implements SecurityState{

    SecureSystem system;
    UserFunctionsMachine machine;

    public LoggedOutState(SecureSystem secureSystem, UserFunctionsMachine userFunctionsMachine) {
        this.system = secureSystem;
        this.machine = userFunctionsMachine;
    }


    @Override
    public void LoggedOutState() {
        system.setSecurityState(system.getLoggedOutState());
        machine.setUserState(machine.getDisconnectedState());
    }

    @Override
    public void LoggedInUserState() {
        system.setSecurityState(system.getLoggedInUserState());
    }

    @Override
    public void LoggedInAdminState() {
        system.setSecurityState(system.getLoggedInAdminState());
    }

    @Override
    public void LoggedInSuperUserState() {
        system.setSecurityState(system.getLoggedInSuperUserState());
    }

    @Override
    public String toString() {
        return "Logged Out State";
    }
}
