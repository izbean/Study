package pattern.adapter;

public class BCompanyVendingMachineSystem implements BCompanyVendingMachine {

    private ACompanyVendingMachine aCompanyVendingMachine;

    public BCompanyVendingMachineSystem(ACompanyVendingMachine aCompanyVendingMachine) {
        this.aCompanyVendingMachine = aCompanyVendingMachine;
    }

    @Override
    public void drop() {
        aCompanyVendingMachine.drop();
    }

    @Override
    public void payments() {
        aCompanyVendingMachine.payments();
    }

    @Override
    public void list() {
        aCompanyVendingMachine.list();
    }

    @Override
    public void itemAdd(String item) {
        System.out.println(item + " 메뉴가 생성 되었습니다.");
    }
}
