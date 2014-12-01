(render :theme :sky
        :title "Bootstrap"
        :author "Nick Rothwell"

        :slides [[:section
                  (heading "The Bootstrap Framework")
                  (subheading "Nick Rothwell")]

                 [:section
                  (heading "What is Bootstrap?")

                  [:p "Bootstrap is a front-end tool set for building web applications"]
                  [:p [:i "Front-end"] " means running in the browser, not the server.)"]

                  (image-h 400 "link_user_1_fb37d.jpg")
                  ]

                 [:section
                  (heading "Screen Shot")

                  (image "stance.jpg")

                  [:p "(Source: " (link "http://www.stance.com/") ")"]]

                 [:section
                  (heading "Modular Structure")

                  [:ul
                   [:li "Scaffolding (grid, ...)"]
                   [:li "CSS (styling)"]
                   [:li "Javascript (actions)"]
                   [:li "Components (icons, ...)"]]]

                 [:section
                  (heading "Bootstrap encapsulates design standards")

                  [:ul
                   [:li.fragment "Grid layout"]
                   [:li.fragment "Navigation bar"]
                   [:li.fragment "Responsive (resizeable) design"]
                   [:li.fragment "Reuseable controls (buttons, menus, ...)"]
                   [:li.fragment "Active controls"]]]

                 [:section
                  [:section
                   (heading "Installation")
                   [:p "(1) Load from a CDN"]

                   (include-code "bootstrap-cdn.html")]

                  [:section
                   (heading "Installation")
                   [:p "(2) Download a precompiled copy"]

                   (include-code "bootstrap-dirtree")]]

                 [:section
                  [:section
                   (heading "Overview")]

                  [:section
                   (heading "Containers")

                   (image "starter-template.jpg")
                   (link "http://getbootstrap.com/examples/starter-template/")]

                  [:section
                   (heading "Navbars")

                   (image "navbar.jpg")
                   (link "http://getbootstrap.com/examples/navbar/")]

                  [:section
                   (heading "Grids")

                   (image "grid.jpg")
                   (link "http://getbootstrap.com/examples/grid/")]

                  [:section
                   (heading "The Bootstrap Theme")

                   (image "theme.jpg")
                   (link "http://getbootstrap.com/examples/theme/")]

                  [:section
                   (heading "The Jumbotron")

                   (image "jumbotron.jpg")
                   (link "http://getbootstrap.com/examples/jumbotron/")]

                  [:section
                   (heading "The Carousel")

                   (image "carousel.jpg")
                   (link "http://getbootstrap.com/examples/carousel/")]]

                 [:section
                  [:section
                   (heading "The Starter Template")

                   (image "starter-template.jpg")

                   (link "http://getbootstrap.com/examples/starter-template/")]

                  [:section
                   (heading "Starter Template: Head")

                   (include-code "starter-header.html")
                   [:p "Note the relative paths (favicon, CSS)."]]

                  [:section
                   (heading "Starter Template: Navbar")

                   (include-code "starter-navbar.html")]

                  [:section
                   (heading "Starter Template: Container")

                   (include-code "starter-container.html")]

                  [:section
                   (heading "Starter Template: Javascript")

                   (include-code "starter-js.html")
                   [:p "Relative paths (again)."]]
                  ]

                 [:section
                  [:section
                   (heading "The Navbar")

                   (link "http://getbootstrap.com/examples/navbar/")
                   [:p "The Navbar is " [:i "responsive"] "."]
                   [:p "(The document is modified with Javascript.)"]]]

                 [:section
                  [:section
                   (heading "Containers")

                   (link "http://getbootstrap.com/css/#overview-container")]

                  [:section
                   (heading "Containers (CSS)")

                   [:p "Place the entire content within a " [:code "container"] " element"]
                   (include-code "div-container.html")
                   [:p "The container supports Bootstrap's grid system"]]]

                 [:section
                  [:section
                   (heading "Exercise 1")
                   (subheading "Make the template work!")

                   [:p "Fix the starter template to correct the appearance"]
                   (image-h 360 "starter-broken.jpg")
                   [:p "(Firefox (and Chrome) are your friends - use the console.)"]
                   [:p "See the " [:a {:href "https://github.com/codezoners-2/HTML/tree/master/05_styling_sites_with_Bootstrap/assignments/starter-template"} "README"] "."]]]

                 [:section
                  [:section
                   (heading "The Grid System")

                   (link "http://getbootstrap.com/css/#grid")]

                  [:section
                   (heading "Grid Rows and Columns")

                   (include-code "col-md.html")]

                  [:section
                   (image-h 300 "simple-grid.jpg")

                   [:p "All rows are 12 columns wide"]
                   [:p "Rows will stack on smaller devices"]]

                  [:section
                   (subheading "Control Stacking on Smaller Devices")

                   [:ul
                    [:li (tt ".col-lg-*") " (large devices - desktops)"]
                    [:li (tt ".col-md-*") " (medium devices - desktops)"]
                    [:li (tt ".col-sm-*") " (small devices - tablets)"]
                    [:li (tt ".col-xs-*") " (extra-small devices - phones)"]]]

                  [:section
                   (heading "Offsetting Columns")

                   (include-code "grid-offsets.html")]

                  [:section
                   (image-h 300 "grid-offsets.png")

                   [:p (tt ".col-md-offset-*") " (or " (tt "-lg-") ", ...) moves"
                    " columns to the right"]]

                  [:section
                   (subheading "Fluid Container")

                   [:p "Use " (tt ".container-fluid") " for full-width containers"]

                   (include-code "container-fluid.html")]]

                 [:section
                  [:section
                   (heading "Exercise 2")
                   (subheading "Fun with the Grid")

                   [:p "Can you create these patterns using Bootstrap's Grid?"]]

                  [:section
                   (image "grid-fun-1.png")]

                  [:section
                   (image "grid-fun-2.png")]

                  [:section
                   (subheading "Hints")

                   [:ul
                    [:li "The colour gradients are done with "
                     (tt "background: linear-gradient(#......, #......)")]
                    [:li "The rounded corners are " (tt "border-radius: 0.5em")]
                    [:li "There's a margin, and a bit of padding, above and/or below the cells"]]]

                  ]

                 [:section
                  [:section
                   (heading "Exercise 3 (Group Exercise!)")
                   (subheading "A Facebook Clone")

                   (image "codezonersbook.png")]

                  [:section
                   (subheading "Bring Everything Together")

                   [:ul
                    [:li "Use the Starter Template"]
                    [:li "Build a navigation bar with drop-down menu"]
                    [:li "Lay out the content in three columns"]]]

                  [:section
                   (subheading "Group Exercise!")

                   [:ul
                    [:li "Write a biog page each"]
                    [:li "Upload them to our tame server"]
                    [:li "Swap URLs for your pages"]
                    [:li "Create a drop-down menu containing a link to each page"]]]]

                 [:section
                  [:section
                   (heading "Exercise 4: The Social Network")

                   (image "fb.jpg")]

                  [:section
                   (subheading "Users and Walls")

                   [:ul
                    [:li "There's a central database of users"]
                    [:li "Every user has a " [:em "wall"] " of posts"]
                    [:li "Each post has a user and some message text"]]

                   [:p "Our web servers now support a message database!"]

                   ]

                  [:section
                   (subheading "Posting messages")

                   (include-code "wall_post.html")
                   (image-h 240 "wall_post_form.png")]

                  [:section
                   (subheading "The Database is Public!")

                   (image-h 360 "nsa.png")]

                  [:section
                   [:p "The Database is available to every page, in a variable called "
                    (tt "db") "."]

                   (include-code "nsa.html")]

                  [:section
                   (subheading "The Exercise:")
                   (subheading "Add a Wall to your Page")

                   [:ul
                    [:li "Add a form, which allows anyone to post a message to your wall"]
                    [:li "Add a panel which lists messages posted to you (with user and text)"]
                    [:li "Use Bootstrap to style the content however you like!"]]]]])
