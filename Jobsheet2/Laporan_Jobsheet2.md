Nama : Alden Dzakwan Septavaryan

Kelas/No : 2G/02 

**Langkah 2**

Code Program
```
package Jobsheet2;

public class Rectangle {
    int widith;
    int height;
}
```

```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.widith = 6;
        r.height = 4;

        System.out.println("Rectangle " + r.widith + "x" + r.height);
    }
}
```
Output Program

<img width="358" height="46" alt="image" src="https://github.com/user-attachments/assets/6d1d79c8-4725-41e0-a68a-a8e728fd1879" />


**Langkah 3**

Code Program
```
package Jobsheet2;

public class Rectangle {
    int width;
    int height;

    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 6;
        r.height = 4;

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```

Output Program

<img width="363" height="63" alt="image" src="https://github.com/user-attachments/assets/fba016a5-fd09-4b77-b8b6-939a6cde17ca" />

**Langkah 4**

Code  Program
```
package Jobsheet2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width=width;
        this.height=height;
    }
    int area(){
        return width * height;
    }

    int perimeter(){
        return 2 * (width + height);
    }
}
```
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 4);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```

Output Program

<img width="349" height="68" alt="image" src="https://github.com/user-attachments/assets/127b2492-53df-4e02-be61-191997118e27" />

**Langkah 5**

Code program
Uji null
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original  = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

        Rectangle empty = null;
        System.out.println(empty.area());
        
    }
}
```
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original  = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

    }
}
```

Output program
Uji null

<img width="1015" height="113" alt="image" src="https://github.com/user-attachments/assets/739c0839-29a3-4d68-ac49-6ea7d2c81255" />

Setelah menghapus uji null

<img width="374" height="81" alt="image" src="https://github.com/user-attachments/assets/ddc25834-da37-4e85-a454-52a6b5f5a1fd" />

**Langkah 6**

Code Program
```
package Jobsheet2;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    Student(String name, String studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String describe(){
        return name + " (" + studentId + ", GPA: " + gpa + ")";
    }
}
```
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle original  = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via copy: " + copy.area());

        Student s = new Student("Nadia", "S001", 3.8 );
        System.out.println(s.describe());
    }
}
```
Output Program

<img width="359" height="104" alt="image" src="https://github.com/user-attachments/assets/6f3b3f32-a95d-4561-9423-4a602812079b" />

**Langkah 7**

Code Program
```
package Jobsheet2;

public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter() );
        }

        Student s = new Student("Nadia", "S001", 3.8 );
        System.out.println(s.describe());
    }
}
```
Output Program

<img width="371" height="100" alt="image" src="https://github.com/user-attachments/assets/aee395ec-dfd9-46d7-b051-dc9cb418c3b1" />
