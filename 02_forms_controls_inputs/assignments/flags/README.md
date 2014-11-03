`-*- mode: markdown; mode: visual-line; mode: adaptive-wrap-prefix; -*-`

# Forms: Painting Flags

Many countries of the world have flags comprising three coloured bars, either vertical or horizontal. We've provided a server page which can draw a flag, if provided with the three colours, the orientation (vertical or horizontal), and, and the country title. The exercise is to implement a form for creating flags. The form should have

- Radio buttons for selecting vertical or horizontal orientation (post to a parameter called `orientation`, with value `h` or `v`)

- Text entry fields for entering colours in hex format (e.g. `FF0000` for red, `0000FF` for green) - post to parameters called `colour1`, `colour2` and `colour3`

- A text entry field for the name of the country (post to a parameter called `countryname`)

The URL details for the form are [here](http://bakirkoy.cassiel.com:8080/describe-flags/).

If you get results which are wrong or confusing, you can always do a "View Source" on the output page to see if your parameters are getting through properly.
