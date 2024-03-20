//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package emailapp;

import java.awt.desktop.SystemSleepEvent;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John","Sims");
        System.out.print(em1.showInfo());
    }
}