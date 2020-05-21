(ns lambdaisland.regal-playground.styles
  (:require [garden.stylesheet :refer [at-font-face]]))

(def jet-brains-mono-regular
  (at-font-face
   {:font-family "JetBrainsMono Regular"
    :src "url('/fonts/JetBrainsMono-Regular.ttf')"}))

(def code [:code :textarea :input {:font-family "JetBrainsMono Regular"
                                   :font-weight 600
                                   :font-size "1rem"}])

(def copy [:h1 :h2 :h3 :p :a {:font-family "ff-meta-serif-web-pro"
                              :font-weight 500
                              :line-height 1.6}])

(def ^{:garden {:output-to "resources/public/styles.css"}}
  main
  [[:.layout {:max-width "max-content"
              :margin "0 auto"
              :display :grid
              :grid-template-columns "minmax(0, 2fr) minmax(min-content, 3fr) minmax(0, 1fr)"}]
   jet-brains-mono-regular
   code
   copy
   [:article {:margin-top "10rem"
              :display :grid
              :grid-template-columns "auto 1fr auto"
              :grid-column-gap "1rem"
              :grid-column-start "2"}]
   [:h1 :h2 :p :input :img :ul :.copy-wrapper {:grid-column-start "2"}]
   [:.logo {:grid-column-start "3"
            :grid-row "7/span 3"}]
   [:.title :.subtitle {:font-variant :all-small-caps
                        :font-weight :bold}]
   [:.title {:font-size "1.5rem"
             :margin-top "5rem"
             :margin-bottom ".8rem"}]
   [:.subtitle {:font-size "1.3rem"
                :display "inline-block"
                :margin 0}]
   [:p {:font-size "1.125rem"
        :max-width "56ch"}]
   ["input[type=\"text\"]" {:border :none
                            :line-height 1.5
                            :width "100%"}]
   [:a {:text-decoration :none}]
   [:label {:align-self :center
            :grid-column-start "1"
            :text-align :right
            :font-variant :all-small-caps
            :font-family "ff-meta-serif-web-pro"}]
   [:ul {:list-style :circle
         :padding-left 0}]
   [:.area {:display :none}]])
