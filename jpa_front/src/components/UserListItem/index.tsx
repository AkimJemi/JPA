import React from "react";
import { UserListItem } from "types/interface";
interface Props {
  userListItem: UserListItem;
}

export default function UserItem({ userListItem }: Props) {
  const { id, name, createdAt, updatedAt } = userListItem;
  return (
    <div>
      <div className="account-list-item">UserListItem</div>
      <div className="account-list-item">id : {id}</div>
      <div className="account-list-item">name : {name}</div>
      <div className="account-list-item">createdAt : {createdAt}</div>
      <div className="account-list-item">updatedAt : {updatedAt}</div>
    </div>
  );
}
