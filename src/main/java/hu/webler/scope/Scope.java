package hu.webler.scope;

public class Scope {

    private static final String CLASS_VARIABLE = "Class variable -> class-level scope";

    private String instanceVariable = "Instance variable -> instance-level scope";
    private int second;
    private String classVariable;

    public void createExample() {
        System.out.println(CLASS_VARIABLE);
        System.out.println(new Scope().instanceVariable);
        Scope scope = new Scope();
        String scope2 = scope.getInstanceVariable();
        String scope3 = scope.instanceVariable;
        String fromMethod = method();
        System.out.println(fromMethod);
        method(CLASS_VARIABLE);
        String methodParam = "This is a method param in createExample method";
        method(methodParam);
        method(instanceVariable, second);
        methodVariable();
        method(classVariable);
        methodWithForLoopAndIncomingParam(CLASS_VARIABLE);
        System.out.println("------------");
        method(CLASS_VARIABLE);
    }

    public String method() {
        return CLASS_VARIABLE;
    }

    public void method(String classVariable) {
        this.classVariable = classVariable; // mit csinál igy?
        classVariable = "From method() -> Method scope???"; // ilyen variable előtte nem volt, Ádám kérte, hogy legyen :)
        System.out.println(classVariable);
        System.out.println(this.classVariable);
    }

    /*public void method(String classVariable) {
        classVariable = "From method() -> Method scope???"; // ilyen variable előtte nem volt, Ádám kérte, hogy legyen :)
        System.out.println(classVariable);
    }*/

    public void method(String classVariable, int num) {
        System.out.println(classVariable + num);
    }

    public void methodVariable() {
        String methodVariable = "Method variable -> method-level scope";
        System.out.println(methodVariable);
    }

    public void methodWithForLoopAndIncomingParam(String classVariable) {
        this.classVariable = classVariable;
        for (int i = 0; i < classVariable.length(); i++) {
            System.out.println(classVariable.charAt(i));
        }
        int i = -1; // bad naming! just showing the scope!!!
        System.out.println(i);
        for (String character: classVariable.split("")) {
            System.out.println(character);
        }
        char character = 'c';
        System.out.println(character);
    }

    public Scope() {

    }

    public Scope(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public Scope(int num) {
        this.second = num;
    }

    public Scope(String txt, int num) {
        this.instanceVariable = txt;
        this.second = num;
    }

    public String getInstanceVariable() {
        return this.instanceVariable;
    }

    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
