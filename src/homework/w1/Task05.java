package homework.w1;
/*
Simbolu virkņu konkatenācija (savienošana jeb saķēdēšana viena aiz otras) ir resursu ietilpīgs process.

Uzdevuma mērķis ir nosakaidrot, kurš no konkatenācijas paņēmieniem darbojas visātrāk:

    vienkārša konkatenācija
    konkatenācija izmantojot StringBuffer klasi
    konkatenācija izmantojot StringBuilder klasi

Uzdevumu var risināt tā, ka ciklā konkatinē lielu daudzumu virkņu un
izmēra programmas darbības laiku, izmantojot System.nanoTime().
 */
public class Task05 {
    public static void main(String[] args) {
        int reps = 10000000;
        bufferConcat(reps,"RandomText");
        builderConcat(reps,"RandomText");

    }

    private static void bufferConcat(int repetitions, String text) {
        StringBuffer buffer = new StringBuffer(text);
        long startTime = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            buffer = buffer.append(text);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("StringBuffer  Method duration :"+  duration/1000000+"ms");

    }

    private static void builderConcat(int repetitions, String text) {
        StringBuilder builder = new StringBuilder(text);
        long startTime = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            builder = builder.append(text);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("StringBuilder Method duration :"+ duration/1000000+"ms");

    }
}
