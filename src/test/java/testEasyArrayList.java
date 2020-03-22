public class testEasyArrayList {

            /**
             * @param args
             */
            public static void main(String[] args) {
                // TODO Auto-generated method stub
                EasyArrayList<String> list = new EasyArrayList<String>();
                list.add("大哥");
                list.add("李四");
                System.out.println("--------新增------------");
                for(int i=0;i<list.getSize();i++){
                    System.out.println(list.get(i));
                }
                list.update(1, "王五");
                System.out.println("--------修改------------");
                for(int i=0;i<list.getSize();i++){
                    System.out.println(list.get(i));
                }
                list.add("赵六");
                list.add("何七");
                System.out.println("--------删除------------");
                System.out.println("删除前：");
                for(int i=0;i<list.getSize();i++){
                    System.out.println(list.get(i));
                }
                list.remove(3);
                System.out.println("删除后：");
                for(int i=0;i<list.getSize();i++){
                    System.out.println(list.get(i));
                }
            }
}
