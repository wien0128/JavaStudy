package thisIsJava.nestedEx.nestedInterface;


public class ButtonMain {
    public static void main(String[] args) {

        Button btnOK = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK clicked");
            }
        }

        btnOK.setClickListener(new OkListener());
        btnOK.click();


        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel clicked");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
