`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Iframes and Home Pages

Many disreputable Internet service providers enforce a branded home page on their users, with advertising and other links. The home page often features forms for search, maps and so on.

- Third-party pages (such as Google Maps) can be embedded into other pages. This is done using `IFRAME` markup. (See the HTML course book, page 189.)

- Bing Search and Google Maps can be called from plain URLs (i.e. without forms): they take parameters in the URL (like we saw in our first experiments in Light Table). For example, to draw a Google Map from a URL, use something like:

        http://maps.google.com/?q=eiffel+tower&output=embed
  
  (Note the `output=embed` part: without this, the resulting page won't embed properly into an iframe.)
  
  (Google Search cannot be embedded in an <CODE>IFRAME</CODE>, for various reasons.)
  
  To search, do this:

        https://www.bing.com/search?q=eiffel+tower
        
Let's bring these features together.

Implement a "home page" which provides:

- a Bing Search text box 
- a Google Maps text box

We've provided a destination page via:

        http://bakirkoy.cassiel.com:8080/embed/
        
You can <CODE>POST</CODE> to this page.

Since you don't have any way to build the query string (such as `q=eiffel+tower`), we've provided some code to do that. You need to provide *pairs of parameters* with names `key` and `value` - in this case, `key=q` and `value=eiffel tower`. Your form needs to provide these.

Browse to

        [http://bakirkoy.cassiel.com:8080/embed/](http://bakirkoy.cassiel.com:8080/embed/)

to see details of the parameters you need to provide.
