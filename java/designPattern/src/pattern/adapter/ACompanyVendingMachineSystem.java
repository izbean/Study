package pattern.adapter;

public class ACompanyVendingMachineSystem implements ACompanyVendingMachine {

    @Override
    public void drop() {
        System.out.println("음료 내림");
    }

    @Override
    public void payments() {
        System.out.println("금액 결제");
    }

    @Override
    public void list() {
        System.out.println("목록 표시");
    }
}
