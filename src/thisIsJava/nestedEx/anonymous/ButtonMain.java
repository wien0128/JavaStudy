package thisIsJava.nestedEx.anonymous;

import thisIsJava.nestedEx.nestedInterface.Button;

public class ButtonMain {
    public static void main(String[] args) {
        Button btnOk = new Button();

        // Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK button clicked");
            }
        });

        btnOk.click();

        Button btnCancel = new Button();

        // Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel button clicked");
            }
        });

        btnCancel.click();
    }
}
