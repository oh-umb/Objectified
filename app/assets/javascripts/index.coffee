$ ->
  $.get "/studio/list", (data) ->
    $.each data, (index, item) ->
      $("#things").append "<li>Thing " + item.label + "</li>"