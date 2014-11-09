`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Login Form

Can you implement a login form and home page? The password scheme is very insecure: all users have the same password (`pass`) and it can't be changed.

You need to check for this password, and create either a "success" page if the password matches, or a "login failed" page if it doesn't. Both pages can be created inside the same template.

Jinja2's conditional statement (`if` ... `else` ... `endif`) will let you choose between different chunks of HTML, depending on whether the login succeeded or not:

        {% if some_condition %}
          <P>Some text here
        {% else %}
          <P>Some other text
        {% endif %}

(It might make it easy to create the two outcomes separately, as distinct templates, and then merge them together.)
