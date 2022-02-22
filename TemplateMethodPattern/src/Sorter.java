public abstract class Sorter {

   public final void sorter(Person[] people){//템플릿 메소드
       bubbleSort(people);
   }
   public void bubbleSort(Person[] people){
           for (int i = 0; i < people.length - 1; i++) {
               for (int j = 0; j < people.length - 1; j++) {
                   if (people[j].getAge() - people[j + 1].getAge() > 0) {
                       Person temp = people[j];
                       people[j] = people[j + 1];
                       people[j + 1] = temp;
                   }
               }
           }
       }
   }
