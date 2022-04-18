//package ApiLayer;
//
//import io.javalin.Javalin;
//import io.javalin.http.Handler;
//
//public class JavalinHTTP {
//
//
//    public static void main(String[] args) {
//        Javalin app = Javalin.create(config ->{
//            config.enableCorsForAllOrigins();
//            config.enableDevLogging();
//        });
//
//        JavalinHTTP controller = new JavalinHTTP();
//        app.get("/", helloWorld);
//
//        app.start();
//    }
//}
