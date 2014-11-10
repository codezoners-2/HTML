`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Forms and Templates

You now know enough to

- upload a page to the server and access it via a URL (`http://bakirkoy.cassiel.com:8080/page/[...]`)
- create a form with a text field named (for example) `user`
- (the new bit:) use a fragment of Jinja2 code to expand `request.form.user` in the middle of an HTML template

Can you create a form with a text field which posts to a template, producing a page containing the form data?

(You don't need to upload the form - it doesn't contain any template code - but you do need to upload the template for the page.)
