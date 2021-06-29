package collections.lists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // interface List

        //implemented clasess

        //ArrayList
        //LinkedList

        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println(arrayList);

        arrayList.add(2,10);
//        System.out.println(arrayList);

        for (int i =0 ; i < arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }

        for(Object x : arrayList)
            System.out.println(x);

        //for each retrival purposes

        //for
        //for-each

        arrayList.get(0);//array[0]

        arrayList.size();//array.length

//        arrayList.remove(10);
//[1,2,3]



    }


    public void add() {

    }

    //acess-modifier return-type method-name(input arguments){
    //        method implementation
    //return
//}

}

//Access modifiers
//1.public (any package)
//2.default (same package)
//3.protected (same package + other package sub classes))
//4.private (same class)


//Collections
//array (size)


// interface
//List

///add()
//remove()
//insert()


//1.List
//list of elements
//duplicates allowed


//2.Set
//list of elements
//duplicates not allowed


//3.Map
//key value pairs