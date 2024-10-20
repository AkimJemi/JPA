import { signInRequest } from "apis";
import { SignInRequestDto } from "apis/request/auth";
import { ResponseDto } from "apis/response";
import { SignInResponseDto } from "apis/response/auth";
import { useRef, useState } from "react";
import { useCookies } from "react-cookie";
import { useNavigate } from "react-router-dom";

//             component: 認定画面             //
export default function Authentication() {
  const [error, setError] = useState<boolean>(false);

  const [view, setView] = useState<"sign-in" | "sign-up">("sign-in");
  const [cookies, setCookies] = useCookies();

  const navitor = useNavigate();

  const SignInCard = () => {
    const emailRef = useRef();
    const passwordRef = useRef();
    const [email, setEmail] = useState<string>("");
    const [password, setPassword] = useState<string>("");
    const signInResponse = (
      responseBody: SignInResponseDto | ResponseDto | null
    ) => {
      if (!responseBody) {
        alert("Network issue");
        return;
      }
      const { code } = responseBody;
      if (code === "DBE") alert("Database issue");
      if (code === "SF" || code === "VF") setError(true);
      if (code !== "SU") return;
      const { token, expirationTime } = responseBody as SignInResponseDto;
      const now = new Date().getTime();
      const expires = new Date(now + expirationTime * 1000);
      setCookies("accessToken", token, { expires, path: MAIN_PATH() });
    };

    const onSignInButtonClickHandler = () => {
      const requestBody: SignInRequestDto = { email, password };
      signInRequest(requestBody).then(signInResponse);
    };
  };
}
