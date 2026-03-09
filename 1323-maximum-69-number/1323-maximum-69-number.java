// class Solution {
//     public int maximum69Number (int num) {
//         String s = String.valueOf(num);
//         s=s.replaceFirst("6","9");
//         return Integer.parseInt(s);
//     }
// }
class Solution {
    public int maximum69Number (int num) {
        int temp = num;
        int position = 0;
        int sixPosition = -1;

        // Find the leftmost 6 (actually last 6 when scanning right to left)
        while (temp > 0) {
            if (temp % 10 == 6) {
                sixPosition = position;
            }
            temp = temp / 10;
            position++;
        }

        // Change that 6 to 9
        if (sixPosition != -1) {
            num += 3 * Math.pow(10, sixPosition);
        }

        return num;
    }
}