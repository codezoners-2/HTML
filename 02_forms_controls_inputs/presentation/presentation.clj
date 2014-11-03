(render :theme :sky
        :title "Forms, Controls and Menus"
        :author "Nick Rothwell"

        :slides [[:section
                  [:section
                   [:h3 "Forms, Controls and Inputs"]
                   [:h4 "Nick Rothwell"]]]

                 [:section
                  [:section
                   [:h3 "Static and Dynamic Content"]]

                  [:section
                   [:h3 "Static Content"]
                   [:h4 "Fixed, not processed"]

                   (image "esr.jpg")]

                  [:section
                   [:h3 "Dynamic Content"]
                   [:h4 "Generated (usually) by server"]

                   (image "amazon.jpg")]]

                 [:section
                  [:section
                   [:h3 "Forms"]

                   (image "footytube.jpg")]

                  [:section
                   [:h3 "Submission"]
                   [:p  "All forms have a submit button."]

                   (image "signup.jpg")]

                  [:section
                   [:p "All forms have an action (target)."]]]

                 [:section
                  [:section
                   [:h3 "Input Types"]]

                  [:section
                   [:h3 "Text (and Password) Fields"]

                   (image "login.jpg")]

                  [:section
                   [:h3 "Radio Buttons"]

                   (image "radio.jpg")]

                  [:section
                   [:h3 "Checkboxes"]

                   (image "ncsa.gif")]

                  [:section
                   [:h3 "Text Area"]

                   (image "textarea.jpg")]

                  [:section
                   [:h3 "Option"]

                   (image "menu.jpg")]]

                 [:section
                  [:section
                   [:h3 "HTML"]]

                  [:section
                   [:h3 "Form Structure"]

                   (include-code "form.html")

                   (image-h 360 "out-submit.jpg")

                   [:p "All forms have an action, a method, and a submit button."]
                   [:p "Method can be " (tt "GET") " or " (tt "POST") "."]]

                  [:section
                   [:h3 "Text Fields"]

                   (code "<INPUT TYPE=\"TEXT\" NAME=\"User\">")
                   (code "<INPUT TYPE=\"PASSWORD\" NAME=\"Pass\">")

                   (image-h 360 "out-textfields.jpg")]

                  [:section
                   [:h3 "Radio Buttons"]

                   (code "<INPUT TYPE=\"RADIO\" NAME=\"Drink\" VALUE=\"Water\"> Water<BR>"
                         "<INPUT TYPE=\"RADIO\" NAME=\"Drink\" VALUE=\"Beer\"> Beer<BR>"
                         "<INPUT TYPE=\"RADIO\" NAME=\"Drink\" VALUE=\"Wine\" CHECKED> Wine")

                   (image-h 360 "out-radio.jpg")]

                  [:section
                   [:h3 "Checkboxes"]

                   (code "<INPUT TYPE=\"CHECKBOX\" NAME=\"Vehicle\" VALUE=\"Bike\"> I have a bike<BR>"
                         "<INPUT TYPE=\"CHECKBOX\" NAME=\"Vehicle\" VALUE=\"Car\" CHECKED> I have a car")

                   (image-h 360 "out-checkboxes.jpg")]

                  [:section
                   [:h3 "Text Area"]

                   (code "<TEXTAREA NAME=\"Email\" ROWS=\"10\" COLS=\"30\">"
                         "The cat was playing in the garden."
                         "</TEXTAREA>")

                   (image-h 360 "out-textarea.jpg")]

                  [:section
                   [:h3 "Option (and Select)"]

                   (include-code "select.html")
                   (image-h 360 "out-option.jpg")]]

                 [:section
                  [:section
                   [:h3 "Exercise 1"]
                   [:h4 "Basic Parameters"]

                   (image-h 360 "URL-tagging-image.png")

                   [:p "Using forms to modify the URL."]

                   [:p "See the " [:a {:href "https://github.com/codezoners-2/HTML/tree/master/02_forms_controls_inputs/assignments/basic-params"} "README"] "."]]

                  [:section
                   [:ul
                    [:li "Create a web page called " [:code "form.html"] ", containing a form."]
                    [:li "The page should contain a form whose action is "
                     [:code "form.html"]
                     " (i.e. itself!)"]
                    [:li "If you submit parameters to the form, those parameters appear in the URL."]

                    ]

                   ]

                  [:section
                   [:h4 "Result (in Light Table)"]

                   (image "params-in-url.png")]]

                 [:section
                  [:section
                   [:h3 "Exercise 2"]
                   [:h4 "Posted Parameters"]

                   [:p "(" [:a {:href "https://github.com/codezoners-2/HTML/tree/master/02_forms_controls_inputs/assignments/posted-params"} "README"] ".)"]]

                  [:section
                   [:h4 "Blank Report"]

                   (image-h 360 "blank-form.png")]

                  [:section
                   [:h4 "Filled Form"]

                   (image-h 360 "test-form.png")]

                  [:section
                   [:h4 "Submitted Form"]

                   (image-h 360 "submitted-form.png")]]

                 [:section
                  [:section
                   [:h3 "Exercise 3"]
                   [:h4 "Flags of the World!"]

                   (image-h 360 "flag-result.png")

                   [:p "(" [:a {:href "https://github.com/codezoners-2/HTML/tree/master/02_forms_controls_inputs/assignments/flags"} "README"] ".)"]]

                  [:section
                   [:h4 "Form Screen Shot"]

                   (image-h 360 "create-a-flag.jpg")]]

                 [:section
                  [:section
                   [:h3 "More Input Types"]
                   [:h4 "(HTML5)"]]

                  [:section
                   [:h4 "Colour"]
                   (code "<INPUT TYPE=\"COLOR\" NAME=\"MyColour\">")
                   (image "input-color.jpg")]

                  [:section
                   [:h4 "Hidden Form Inputs"]
                   (code "<INPUT TYPE=\"HIDDEN\" NAME=\"MyParam\" VALUE=\"True\">")]

                  [:section
                   [:h3 "Validation, Place-holders"]
                   [:h4 "(HTML5)"]

                   (code "<INPUT TYPE=\"TEXT\" NAME=\"countryname\" REQUIRED PLACEHOLDER=\"Country\">")
                   (image-h 300 "place-holder.jpg")]]

                 [:section
                  [:section
                   [:h3 "Exercise 4"]
                   [:h4 "Smarter Flags"]
                   [:p "(" [:a {:href "https://github.com/codezoners-2/HTML/tree/master/02_forms_controls_inputs/assignments/flags-2"} "README"] ".)"]]

                  [:section
                   [:p "Create a flag form with colour inputs, validation and a place-holder."]
                   (image "flag-validation-etc.jpg")]

                  [:section
                   [:p "Create a page with (only!) a button for each flag."]
                   [:p "(use " [:code "HIDDEN"] " input types.)"]
                   (image "flags-hidden.jpg")]]

                 [:section
                  [:section
                   [:h3 "Embedded Content with Iframes"]
                   (image "visit-us.png")]

                  [:section
                   [:h4 "Embed with an " [:code "IFRAME"] " tag"]
                   (include-code "iframe.html")
                   [:p "Note the encoded arguments, and the " [:code "output=embed"]
                    " to force embedding in Maps."]]]

                 [:section
                  [:section
                   [:h3 "Exercise 5"]
                   [:h4 "A Home Page"]
                   [:p "(" [:a {:href "https://github.com/codezoners-2/HTML/tree/master/02_forms_controls_inputs/assignments/iframes"} "README"] ".)"]
                   ]

                  [:section
                   [:p "Create a home page with a form for searching (with Bing!)
                        and for a map search with Google Maps"]
                   (image "sleazy-home.png")]


                  [:section
                   [:p "The resulting page (already provided) will place the
                        fetched page into an " [:code "IFRAME"] "."]
                   (image "sleazy-results.png")]]])
