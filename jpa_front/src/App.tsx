import React from "react";
import "./App.css";
import UserItem from "components/UserListItem";
import { latestUserListMock } from "mocks";

function App() {
  return (
    <>
      {latestUserListMock.map((userListItem) => (
        <UserItem userListItem={userListItem} />
      ))}
    </>
  );
}

export default App;
