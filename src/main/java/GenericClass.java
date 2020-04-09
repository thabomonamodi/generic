public class GenericClass<T>
{
        private static Object param;

        public GenericClass()
        {}

        public static <T> void printArrayContent(T[] arr)
        {
            for (T element: arr)
            {
                System.out.printf("%s ",element);
            }
            System.out.println();
        }

        public void set(Object Array)
        {
            param = Array;
        }

        public Object get()
        {
            System.out.println(param);
            return param;
        }

        public static void main(String[] args)
        {
            GenericClass<String> stringInstance = new GenericClass<>();
            GenericClass<Integer> integerInstance = new GenericClass<>();

            Integer[] intArray = {100,95,0};
            String[] stringArray = {"hello","Julie"};

            GenericClass gen = new GenericClass();
            System.out.print("Array content: ");
            gen.printArrayContent(stringArray);
            System.out.println("String instance:");
            stringInstance.set("Test");
            stringInstance.get();
            System.out.println("Integer instance:");
            integerInstance.set(1000);
            integerInstance.get();
        }
}
