`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Forms: Basic Parameter Handling

It's possible to send information from a form to a web server using two mechanisms: `GET` and `POST`. For production servers it's strongly recommended to use `POST` - it's more robust and secure - but if we use `GET` we can see how parameters are generated from a form: the parameters get appended to the URL of the form target.

## Setup

To get started, do the following:

Create a web page called `form.html`, containing an HTML form with a text input field and a submit button. The form's `METHOD` should be `GET`, and its action should be `form.html` (i.e. the same page as the form itself).

This is the input field we've used:
  
        <INPUT TYPE="TEXT" NAME="User">

Enter some text and submit the form. You should see the text field's contents as part of the URL. Before submitting the form:

        [...]/form.html
        
After submitting the form:
  
        [...]/form.html?User=hello+world
        
## Exercises
 
Can you generate the following URLs using form controls?

- `form.html?Meal=Spaghetti` using radio buttons
- `form.html?Car=Cortina&Car=Rolls+Royce` using checkboxes
- `form.html?Car=Cortina` using select and option (menu)
