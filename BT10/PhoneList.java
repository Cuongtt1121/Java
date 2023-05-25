package BT10;

import java.util.ArrayList;
    public class PhoneList extends Phone {
        private ArrayList<PhoneNumber> phoneList;
        public PhoneBook(){
            phoneList = new ArrayList<>();
        }

        @Override
        public void insertPhone(String name, String phone) {

        }

        @Override
        public void removePhone(String name) {
            for (PhoneNumber p : phoneList) {
                if (p.getName().equals(name)) {
                    phoneList.remove(p){
                }

        }



        @Override
        public void sort() {
                    //bubble sort
                int size = phoneList.size();
                for (int i=0; i<size-i-1; i++ ){
                    String name_pj = phoneList.get(j).getName();
                    String name_pj1 = phoneList.get(j+1).getName();
                    if (name_pj.compareTo(name_pj1)>0){
                        PhoneNumber tmp = phoneList
                    }
                }
                }

        }
    }

        @Override
        public void updatePhone(String name, String oldPhone, String newPhone) {

        }

        @Override
        public void searchPhone(String name) {

        }

