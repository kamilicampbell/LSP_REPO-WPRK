package org.howard.edu.lspfinal.question4;

/**
 * Briefly discuss one instance where using a design pattern may not be beneficial.
 * 
 */
public class DesignPatternParagraph {
    public static void main(String[] args) {
        System.out.println("Using a design pattern may not be beneficial in the case of using simple inheritance from a parent class to multiple subclasses, especially when not all subclasses require the same behavior. Inntroducing patterns in such cases can lead to the addition of unnecessary abstraction, extra classes, and interfaces that don’t add value. This can make the code harder to understand, maintain, and extend. For example, in relation to an example covered in class, consider a class called Duck that has behaviors like quacking, swimming and flying and then consider three subclasses: MallardDuck, RedheadDuck and RubberDuck. This would be fine - except a rubber duck cannot fly. Therefore, the 'fly' operation in the parent Duck class forces an unrealistic behavior on the RubberDuck. This would have to be rectified by removing the 'fly' operation from the Duck class and selectively implement it in the subclasses of ducks that can actually fly, along with other possible operators that would be uniquely utilized in some of the subclasses and not all. This therefore destroys the simplicity of using an inheritance design pattern and makes the pattern more burdensome than beneficial as the pattern designing process becomes unneccesarily confusing and less 'pattern-like'. Hence, it might be better to consider an alternative design pattern in such situations to maintain flexibility and clarity.");
    }
}

//user principle, 