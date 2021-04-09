import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    private static final Marker KIJELENT = MarkerManager.getMarker("KIJELENT");
    private static final Marker KERELEM = MarkerManager.getMarker("KÉRELEM");

    public static void main(String[] args) {
        int iterationCount = 2;
        if(args.length == 1){
            iterationCount = Integer.parseInt(args[0]);
        }
        for (int i = 1; i <= iterationCount; i++){
            ThreadContext.put("iterationNumber", String.valueOf(i));
            logger.trace(KIJELENT, "Jó reggelt, jó reggelt,");
            logger.debug(KIJELENT, "Kedves liliomszál,");
            logger.info(KIJELENT,"Megöntözlek rózsavízzel,");
            logger.warn("Hogy ne hervadozzál.");
            logger.error(KERELEM, "Szabad-e locsolni?");

            ThreadContext.clearAll();
        }
    }
}
