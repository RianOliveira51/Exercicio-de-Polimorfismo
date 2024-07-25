package com.example.exerciciopolimorfismo;

import com.example.exerciciopolimorfismo.entities.Employee;
import com.example.exerciciopolimorfismo.entities.OutsourceEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/*Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas E
  valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional. O pagamento dos funcionários corresponde ao valor
  da hora multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente
  a 110% de sua despesa adicional. Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e
  armazena-los em uma lista. Depois de ler todos os dados mostrar o nome e pagamento de cada funcionário na mesma ordem em que
  foram digitados.
*/

@SpringBootApplication
public class ExercicioPolimorfismoApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            //consumindo quebra de linha
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour:");
            double valueHours = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourceEmployee(name, hours, valueHours, additionalCharge);
                list.add(emp);
                //metodo alternativo, assim não precisa de uma variavel.
                //list.add(new OutsourceEmployee(name, hours, valueHours, additionalCharge))
            }
            else{
                Employee emp = new Employee(name, hours, valueHours);
                list.add(emp);
            }

            System.out.println();
            System.out.println("Payment");
            for(Employee emp : list){
                System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
            }
        }

        sc.close();
    }

}
