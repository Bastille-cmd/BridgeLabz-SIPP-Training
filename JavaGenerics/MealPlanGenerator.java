interface MealPlan {
    String getType();
}

class VegetarianMeal implements MealPlan {
    public String getType() {
        return "Vegetarian";
    }
}

class VeganMeal implements MealPlan {
    public String getType() {
        return "Vegan";
    }
}

class KetoMeal implements MealPlan {
    public String getType() {
        return "Keto";
    }
}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) {
        this.plan = plan;
    }
    T getPlan() {
        return plan;
    }
}

public class MealPlanGenerator {
    static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated plan: " + plan.getType());
    }

    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        generatePlan(veg);
    }
}