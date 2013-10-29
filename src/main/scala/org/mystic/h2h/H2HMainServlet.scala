package org.mystic.h2h

import scala.slick.session.Database


class H2HMainServlet(db: Database) extends H2hTestAppStack {

  get("/h2h-nba-div1") {
    contentType = "text/html"
    ssp("/league",
      "layout" -> "WEB-INF/templates/layouts/h2h.ssp",
      "leagueName" -> "NBA Div 1",
      "leagueURI" -> "http://www.sports.ru/fantasy/basketball/league/9826.html")
  }


  get("/h2h-nba-div2") {
    contentType = "text/html"
    ssp("/league",
      "layout" -> "WEB-INF/templates/layouts/h2h.ssp",
      "leagueName" -> "NBA Div 2",
      "leagueURI" -> "http://www.sports.ru/fantasy/basketball/league/9831.html")
  }

  get("/db") {
    db withSession {

    }
  }

//  get("/h2h-khl") {
//    contentType = "text/html"
//    ssp("/khl",
//      "layout" -> "WEB-INF/templates/layouts/h2h.ssp",
//      "pageSize" -> 50,
//      "currentPage" -> 0,
//      "uri" -> "/h2h-khl/",
//      "leagueName" -> "КХЛ",
//      "leagueURI" -> "http://www.sports.ru/fantasy/hockey/tournament/ratings/leaders/107.html")
//  }
//
//  get("/h2h-khl/:id") {
//    contentType = "text/html"
//    ssp("/khl",
//      "layout" -> "WEB-INF/templates/layouts/h2h.ssp",
//      "pageSize" -> 50,
//      "currentPage" -> Integer.parseInt(params("id")),
//      "uri" -> "/h2h-khl/",
//      "leagueName" -> "КХЛ",
//      "leagueURI" -> "http://www.sports.ru/fantasy/hockey/tournament/ratings/leaders/107.html")
//  }

  get("/") {
    contentType = "text/html"
    ssp("/index")
  }

  notFound {
    <h1>Not found. Bummer.</h1>
  }

}
