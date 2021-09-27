package pattern.adapter;

public class VendingMachine {
    public static void main(String[] args) {
        BCompanyVendingMachine bCompanyVendingMachine = new BCompanyVendingMachineSystem(new ACompanyVendingMachineSystem());

        bCompanyVendingMachine.list();
        bCompanyVendingMachine.payments();
        bCompanyVendingMachine.drop();
        bCompanyVendingMachine.itemAdd("아이스 카푸치노");
    }
}
