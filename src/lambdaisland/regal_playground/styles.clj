(ns lambdaisland.regal-playground.styles)

(def grid-areas "\"input  input input result    result\"
                 \"regal  regal regal result    result\"
                 \"regal  regal regal generator plaintext\"
                 \"flavor regex regex generator plaintext\"")

(def ^{:garden {:output-to "resources/public/styles.css"}}
  main
  [[:body {:margin 0
           :height "100vh"}]
   [:#app {:height "100%"}]
   [:.layout {:display               :grid
              :grid-template-columns "auto 1fr 1fr 1fr 2fr"
              :grid-template-rows    "auto 50px 3fr auto"
              :grid-gap              "10px"
              :grid-template-areas   grid-areas
              :height "100%"}]
   [:.area {:background-color :gainsboro
            :padding "10px"
            :display :grid
            :grid-template-rows "1fr auto"}
    [:.area-title {:grid-row-start 2
                   :font "normal 1.1rem/1 sans-serif"
                   :margin ".5rem 0"}]]
   [:.regal-form {:grid-area "regal"}]
   [:.flavor {:grid-area "flavor"}]
   [:.regex {:grid-area "regex"}]
   [:.input-string {:grid-area "input"}]
   [:.result {:grid-area "result"}]
   [:.plaintext {:grid-area "plaintext"}]
   [:.generator {:grid-area "generator"}]])
