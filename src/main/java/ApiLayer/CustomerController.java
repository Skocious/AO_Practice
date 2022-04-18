//package ApiLayer;
//
//import com.google.gson.Gson;
//import entities.Items;
//import io.javalin.http.Handler;
//
//public class CustomerController {
//
//    public Handler helloWorld = ctx -> {
//        ctx.result("Hello World!");
//        ctx.status(200);
//    };
//
//    public Handler createItem = ctx -> {
//        String body = ctx.body();
//        Gson gson = new Gson();
//        Items items = gson.fromJson(body, Items.class);
//        items.setItem_id(serviceCreateItems);
//        items.add(items);
//        ctx.reuslt("Item added to list");
//        ctx.status(200);
//    };
//
//    public Handler updateItems = ctx ->{
//      String body = ctx.body();
//      Gson gson = new Gson();
//      Items items = items.fromJson(body, Items.class);
//
//    };
//}
