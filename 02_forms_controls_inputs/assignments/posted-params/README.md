`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Forms: Posting to a Server

Putting parameters into the URL via `GET` is not good practice: it's a security risk (parameters are visible and can be modified), and the scheme doesn't support large amounts of data (such as file uploads). This is why forms generally use `POST`.

There's no difference in the form itself between `GET` and `POST`, apart from the `METHOD` parameter.

For this assignment, we've provided a server which responds to a `POST` request. If you browse to

        http://bakirkoy.cassiel.com:8080/blank-form/
        
You'll see an empty "report card." The assignment is to create a form which will populate this card. (See the presentation for an example of a form, and the populated page.)

To post to the page, use the URL

        http://bakirkoy.cassiel.com:8080/submit/

This URL will only accept a `POST` method from a form.

Can you populate the page with data from a form? The blank card gives the names of the fields.
