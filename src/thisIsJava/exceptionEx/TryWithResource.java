package thisIsJava.exceptionEx;

public class TryWithResource {
    public static void main(String[] args) {
        try (MySrc res = new MySrc("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        try (MySrc res = new MySrc("A")) {
            String data = res.read2();
            // NumberFormatException 발생
            int value = Integer.parseInt(data);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println();

        MySrc res1 = new MySrc("A");
        MySrc res2 = new MySrc("B");
        try (res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read1();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
