package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Created by ruanyiming on 14-4-15.
 */
public class Blog extends Controller{

        public static Result index() {
            return ok(index.render("Your new application is ready."));
        }
 }
