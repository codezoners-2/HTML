(render :theme :sky
        :title "Templating with Jinja2"
        :author "Nick Rothwell"


        :slides [[:section
                  [:section
                   (heading "Templating with Jinja2")
                   (subheading "Nick Rothwell")]]

                 [:section
                  [:section
                   (heading "Dynamic Content")
                   (subheading "Server-Generated")

                   (image "amazon.jpg")]

                  [:section
                   (subheading "Flags")

                   (image "flag-result.png")
                   ;; View Source of some flags, compare with source of flags-hardwired forms.
                   ]]

                 [:section
                  [:section
                   (heading "Workflow")

                   [:ul
                    [:li.fragment "HTML Form..."]
                    [:li.fragment "(... routing code ...)"]
                    [:li.fragment "... Template"]]]
                  ;; Also: cookies, databases, ...

                  [:section
                   (heading "Templates")
                   (subheading "PHP")

                   (include-code "php.html")]

                  [:section
                   (heading "Templates")
                   (subheading "JSP + JSTL (Java)")

                   (include-code "jstl.html")]
                   ;; Each has a host language.

                  [:section
                   (heading "Templates")
                   (subheading "Jinja2 (Python)")

                   (include-code "jinja2.html")
                    ;; (All the forms handlers (flags, etc.) from last week were written in Jinja2.)
                   ]

                  [:section
                   [:p "The browser doesn't see the template - it just sees HTML."]

                   [:p "(e.g. flags.)"]]

                  [:section
                   (heading "Jinja2: Example")
                   [:p "In the form:"]

                   (code "<INPUT TYPE=\"TEXT\" NAME=\"user\">")

                   [:p "In the template:"]

                   (code "<P>Welcome back, {{ request.form.user }}.")

                   [:p "(" [:code "request.form"] " is provided by the server.)"]]]

                 [:section
                  [:section
                   (heading "Exercise 1")
                   (subheading "Form and Template")

                   [:p "Write a form with a text field, and a template"
                    " which prints the value of the field."]

                   [:div
                    (image-h 300 "form.png")
                    (image-h 300 "form-done.png")]

                   [:p "See the " [:a {:href "https://github.com/codezoners-2/HTML/tree/master/03_templating_with_Jinja2/assignments/basics"} "README"] "."]

                   [:p "However..."]]]

                 [:section
                  [:section
                   (heading "Uploading Templates")

                   [:ul
                    [:li "You can upload HTML templates to " [:code "http://bakirkoy.cassiel.com:8080/upload"]]
                    [:li "For any file you upload with name " [:code "myfile.html"] " will be"
                     " available at " [:code "http://bakirkoy.cassiel.com:8080/page/myfile"]]
                    [:li "These pages are available via " [:code "GET"] " (from the browser),"
                     " or " [:code "POST"] " (as a form action)"]]]

                  [:section
                   (subheading "so... to start:")

                   [:ul
                    [:li "Create a simple HTML page"]
                    [:li "Upload it"]
                    [:li "Make sure that you can see it in the browser"]
                    [:li "And - " [:strong "please"] " - use your name as a prefix for your files "
                     "since everyone's files are stored in the same place"]]

                   ]
                  ]

                 [:section
                  [:section
                   (heading "More Jinja!")]

                  [:section
                   (subheading "Conditional Expressions")

                   (code "{{ request.form.user if request.form.user else 'Anonymous' }}")

                   [:p "Try this, to print \"Anonymous\" if the user doesn't type in a name."]
                   ]

                  [:section
                   (subheading "Arithmetic")

                   (code "{{ 10 * 10 }}")

                   [:p "(And other operators...)"
                    ]
                   ]

                  [:section
                   (subheading "Comparison")

                   (code "{{ 'empty basket' if num_items == 0 else ...  }}")]]

                 [:section
                  [:section
                   (heading "Statement Blocks")

                   (include-code "statement-block.html")]]

                 [:section
                  [:section
                   (heading "Exercise 2")
                   (subheading "A 'Pretend' Login Screen")

                   [:div
                    (image-h 300 "login-ok.png")
                    (image-h 300 "login-fail.png")]]

                  [:section
                   (subheading "Low-Security Login")

                   [:ul
                    [:li "Implement a login screen which accepts any user with password " [:code "pass"]]
                    [:li "Display a welcome page if the user logs in successfully"]
                    [:li "Display a \"failed\" page if the password is not correct"]]

                   [:p "See the " [:a {:href "https://github.com/codezoners-2/HTML/tree/master/03_templating_with_Jinja2/assignments/login"} "README"] "."]

                   ]
                  ]

                 [:section
                  [:section
                   (heading "Exercise 3")
                   (subheading "A Superhero Login System")

                   [:div
                    (image-h 300 "logan.png")
                    (image-h 300 "wolverine.png")]

                   ]
                  [:section
                   (subheading "Superhero Login")

                   [:ul
                    [:li "Modify the previous exercise to recognise various superheroes"
                     " by their everyday names"]
                    [:li "Display a welcome page as before for \"normal\" users"]
                    [:li "For superheroes, display their codename instead."
                     " You can write it in red like this:"

                     (include-code "red.html")
                     ]
                    ]

                   [:p "See the " [:a {:href "https://github.com/codezoners-2/HTML/tree/master/03_templating_with_Jinja2/assignments/superhero"} "README"] "."]]

                  [:section
                   (subheading "Age Limits")

                   [:ul
                    [:li "Implement an age limit"]
                    [:li "Add a form field for users to input their age"]
                    [:li "Reject the login if they are under 18"]
                    [:li "(Should young superheroes be allowed in? I think so!)"]]]
                  ]

                 [:section
                  [:section
                   (heading "Exercise 4")
                   (subheading "Flags")

                   [:div
                    (image-h 300 "flag-germany.jpg")
                    (image-h 300 "flag-ireland.jpg")]]

                  [:section
                   (subheading "Create the Flag Template")

                   [:p "You've already created the form which posts parameters to a flag template."
                    " This exercise is to create the template!"]

                   [:p [:strong "Hints:"]]

                   [:ul
                    [:li "Use your browser to fetch and save a couple of flags, one vertical and one horizontal"]
                    [:li "Use these two files as the starting point for your template"]
                    [:li "Think carefully about how the parameters work (" [:code "countryname"] ", "
                     [:code "orientation"] " and so on)"]
                    [:li "Work incrementally!"]]]

                  [:section
                   (heading "Bonus Exercise")
                   (subheading "Simpler Flags")

                   [:ul
                    [:li "Some countries (Indonesia, Monaco, ...) have only two stripes"]
                    [:li "Can you modify your template to support these as well?"]
                    [:li "(Think about how the parameters might indicate 2 rather than 3 stripes)"]]

                   [:p "(For the ambitious: try Mauritius!)"]]]

                 ;; Part II: Templates and Styling
                 ;; Flags redux: jinja vars can be anywhere - even inside strings.

                 [:section
                  [:section
                   (heading "Templating with Jinja2")
                   (subheading "Part II: Loops and Styling")]]

                 [:section
                  [:section
                   (heading "Yet More Jinja!")]

                  [:section
                   (heading "For-Loops")

                   (include-code "jinja-for.html")

                   [:p "The " [:code "range(n1, n2)"] " function returns a sequence of numbers"
                    " (including " [:code "n1"] ", excluding " [:code "n2"] ")."]]

                  [:section
                   (image "for-loop.png")]]

                 [:section
                  [:section
                   (heading "Templating the CSS")

                   [:p "We can change the CSS class of an element"
                    " based on a conditional test:"]

                   (include-code "for-5.css")

                   (include-code "jinja-for-5.html")]

                  [:section
                   (image "for-loop-5.png")]]

                 [:section
                  [:section
                   (heading "Nested Loops")

                   [:p "For-loops can be nested"]

                   (include-code "for-nested.html")]

                  [:section
                   (image "for-nested.png")]]

                 [:section
                  [:section
                   (heading "Exercise 5")
                   (subheading "Times Tables")

                   (image "times.png")]

                  [:section
                   (subheading "Hints")

                   [:ul
                    [:li "Rather than HTML tables, attempt this with " (tt (htmlize "<DIV>")) " and "
                     (tt (htmlize "<SPAN>")) " elements"]

                    [:li "If it helps: build a small (e.g. 3 x 3) table by hand first"]

                    [:li "Don't worry about appearance (yet!)"]]]

                  [:section
                   (heading "Exercise 5a")
                   (subheading "Add row and column headers")

                   (image "times-headers.png")]]

                 [:section
                  [:section
                   (heading "Uploading")

                   [:ul
                    [:li "Upload to " (tt "http://") [:i "address"] (tt ":8080/upload/")]
                    [:li "HTML files and CSS files can be uploaded"]
                    [:li "HTML files will appear with URLs like "
                     (tt "http://") [:i "address"] (tt ":8080/page/") [:i "file"] (tt "/")]
                    [:li "CSS files will appear with URLs like "
                     (tt "http://") [:i "address"] (tt ":8080/page/css/") [:i "file"] (tt "/")]
                    [:li "Please use unique filenames (containing your name!)"]]]]

                 [:section
                  [:section
                   (heading "Special Loop Variables")

                   [:p "There's a special variable called " (tt "loop")
                    " which tracks loop iterations"]

                   [:p (tt "loop.cycle") " cycles between values within a loop"]

                   (include-code "loop-cycle.html")]

                  [:section
                   (image "loop-cycle.png")]

                  ]

                 [:section
                  [:section
                   (heading "Exercise 6")
                   (subheading "Styled Multiplication Table")

                   (image "styled-table.png")]

                  [:section
                   [:ul
                    [:li "All the styling/colouring is in CSS"]

                    [:li "Implement the table with " (tt (htmlize "<DIV>")) " and "
                     (tt (htmlize "<SPAN>")) " rather than an HTML table"]

                    [:li "The numbers are right-justified"]

                    [:li "There is extra margin space separating the headers from the"
                     " body of the table"]

                    [:li "The rows are alternately coloured with two different"
                     " shades of grey"]

                    [:li "The perfect squares on the diagonal are in bold"]]]]

                 [:section
                  [:section
                   (heading "Exercise 7")
                   (subheading "Tables of Cubes")

                   (image "cubed.png")]

                  [:section
                   (subheading "(At most) three tables per row")

                   (image "cubed-wide.png")]

                  [:section
                   [:ul
                    [:li "Each table has a full-width header bar and a narrow border"]
                    [:li "Each perfect cube number is highlighted against black"]]]]])
