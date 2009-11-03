package slim3.demo.controller.blog;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import slim3.demo.service.BlogService;

public class DeleteController extends Controller {

    private BlogService service = new BlogService();

    @Override
    public Navigation run() {
        service.delete(asKey("key"), asLong("version"));
        return redirect(basePath);
    }
}