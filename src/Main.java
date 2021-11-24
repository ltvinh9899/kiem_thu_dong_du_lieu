public class Main {

    public static void main(String[] args) {

    }


    // position = 1  is employee
    // position = 0  is inter
    public int tinhLuong (int position, int hour){
        int salary = 0;

        if((position > 1 && position <0) || hour < 0){
            return -1;
        }

        if(position == 1){
            salary = 100;
            if(hour > 200){
                salary += 2*hour;
            }
        } else {
            salary = 20;
            if(hour > 200){
                salary += 1*hour;
            }
        }
        return salary;
    }

}
