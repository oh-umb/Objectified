(function() {
  $(function() {
    return $.get("/studio/list", function(data) {
      return $.each(data, function(index, item) {
        return $("#things").append("<li>Thing " + item.label + "</li>");
      });
    });
  });
}).call(this);
