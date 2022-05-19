/*
 * Copyright (C) 2009-2022 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.impl.engine.ws

import scala.util.control.NoStackTrace

case class UserRequestedCloseFrameException(code: Int, reason: String) extends Exception(reason) with NoStackTrace
