package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Биба Христофтор Колумбович", "Философия бытия и практического капания на мозг");
        Student student = new Student("Боба Безымянный Пятникович");
        teacher.evaluate(student);
    }
    public static class Teacher {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getThing() {
            return thing;
        }

        public void setThing(String thing) {
            this.thing = thing;
        }

        private String thing;

        public Teacher(String name, String thing) {
            this.name = name;
            this.thing = thing;
        }
        public void evaluate(Student student) {
            int a = (int)(Math.random()*4+2);
                String assessment = null;
                switch (a) {
                case 2: assessment = "Неудовлетворительно"; break;
                case 3: assessment = "Удовлетворительно"; break;
                case 4: assessment = "Хорошо"; break;
                case 5: assessment = "Отлично"; break;}
        System.out.println("Преподаватель "+this.name+" оценил студента по имени "
                +student.getName()+" по предмету "+this.thing+" на оценку "+assessment); }
            }
     static class Student {
        private  String name;
        public Student (String name) {
            this.name = name;
            }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }
        }
    }