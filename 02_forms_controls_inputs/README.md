`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Forms, Controls and Inputs

So far we've looked at "passive" HTML: pages which are transferred from web server to browser with processing. Each page arrives in the browser exactly as it is stored on the server. This content is often referred to as *static*: it never changes, and it the same each time it is requested, regardless of who asks for it. (Images, CSS stylesheets and so on are almost always static as well.)

Web sites generally serve *dynamic* data: pages have varying content, pulled from data feeds or databases, and often depending on user credentials (who is logged in). Example: Facebook, which is (obviously) customised for each user. Or newsfeed sites.

Often, page content depends on user interaction: information which is passed from browser to web server. Obvious example: logging into a web site (user and password come from browser, authenticated by server, content passed back tailored for that user if login is successful). This kind of information is entered on a page and submitted using *HTML forms*.
